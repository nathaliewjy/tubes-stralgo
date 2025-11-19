package tubes.models;

import java.util.ArrayList;
import java.util.List;

public class Pemusik {
    private String nama;
    private Status status;

    private List<AlatMusik> alatMusik = new ArrayList<>();

    public Pemusik(String nama) {
        this.nama = nama;
        this.status = Status.READY;
    }

    public void addAlatMusik(AlatMusik alatMusik) {
        this.alatMusik.add(alatMusik);
    }

    public List<AlatMusik> getAlatMusik() {
        return this.alatMusik;
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
