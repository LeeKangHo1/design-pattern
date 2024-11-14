package ch07.pub;

import ch07.sub.SubListener;

public interface PubListener {
    // 컬렉션(구독한 유저 모음?)에 sub 등록
    void add(SubListener sub);
    // 컬렉션에서 sub 삭제
    void remove(SubListener sub);
    // 구독자 모두에게 메세지 보내기(구독 채널에 영상이 올라왔을 때)
    void notifyChange(String msg);
}
