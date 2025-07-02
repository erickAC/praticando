package designpatterns.adapter;

public class Main {

    public static void main(String[] args) {

        ImageAdapter imageAdapter = new MpegAdapter(new MpegConverter());
        imageAdapter.read("aaaaa.mpeg");
    }

}
