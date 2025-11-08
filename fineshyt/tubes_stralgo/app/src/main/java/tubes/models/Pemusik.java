package tubes.models;

public class Pemusik {
    private String nama;
    private Status status;

    public Pemusik(String nama) {
        this.nama = nama;
        this.status = Status.READY;
    }

    public String getNama() {
        return this.nama;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Status getStatus() {
        return this.status;
    }
}
