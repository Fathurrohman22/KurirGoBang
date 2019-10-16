package fathurrohman.cv.kurirgobang;

public class CustomPesan {
    private String name;
    private String status, alamat;

    public CustomPesan() {

    }

    public CustomPesan(String name, String status, String alamat) {
        this.name = name;
        this.status = status;
        this.alamat = alamat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
