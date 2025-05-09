package day26.threaddemo;

public class FacebookLike {
    private int likes;

    public FacebookLike(int likes) {
        this.likes = likes;
    }

    public synchronized void  incrementLikes() {
        try {
            System.out.println(likes);
            Thread.sleep(3000);
            likes++;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
