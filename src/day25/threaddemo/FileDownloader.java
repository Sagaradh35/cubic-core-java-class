package day25.threaddemo;

public class FileDownloader extends Thread{
    private String url;
    public FileDownloader(String url){
        this.url=url;

    }
    @Override
    public void run() {
        FileDownload fd = new FileDownload();
        fd.download(url);
    }
}
