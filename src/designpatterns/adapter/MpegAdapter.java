package designpatterns.adapter;

public class MpegAdapter implements ImageAdapter {
    private final MpegConverter mpegConverter;

    public MpegAdapter(MpegConverter mpegConverter) {
        this.mpegConverter = mpegConverter;
    }

    @Override
    public void read(String fileName) {
        this.mpegConverter.converter(fileName);
    }

}
