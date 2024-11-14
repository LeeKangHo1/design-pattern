package ch08.pub;

import ch08.sub.SubListener;

import java.util.ArrayList;
import java.util.List;

public class Pub {

    public String value = null;

    public void income() {
        value = "바나나";
    }

    List<SubListener> subList = new ArrayList<>();

    public void add(SubListener sub) {
        subList.add(sub);
    }

    public void notifyChange(String msg) {
        for (SubListener sub : subList) {
            sub.update(msg);
        }
    }
}
