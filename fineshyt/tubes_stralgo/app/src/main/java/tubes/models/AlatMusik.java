package tubes.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AlatMusik {
    private String namaAlat;
    private ArrayList<Pemusik> listPemusik;

    public AlatMusik(String namaAlat) {
        this.namaAlat = namaAlat;
        this.listPemusik = new ArrayList<>();
    }

    public void tambahPemusik(Pemusik pemusik) {
        this.listPemusik.add(pemusik);
    }

    public ArrayList<Pemusik> getListPemusik() {
        return this.listPemusik;
    }

    public int jumlahPemusik() {
        return this.listPemusik.size();
    }
}
