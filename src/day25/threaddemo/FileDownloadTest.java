package day25.threaddemo;

public class FileDownloadTest {
    public static void main(String[] args) {
        FileDownloader fdr1 = new FileDownloader("url1");
        FileDownloader fdr2 = new FileDownloader("url2");
        FileDownloader fdr3 = new FileDownloader("url3");
        FileDownloader fdr4 = new FileDownloader("url4");
        fdr1.start();
        fdr2.start();
        fdr3.start();
        fdr4.start();

    }
}
