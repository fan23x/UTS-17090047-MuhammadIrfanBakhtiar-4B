package entity;

public class Servismtr {

    private String id;
    private String pemilik;
    private String merk;

    public Servismtr(String id, String pemilik, String merk) {
        this.id = id;
        this.pemilik = pemilik;
        this.merk = merk;

    }

    public boolean equals(Object object){
        Servismtr tmp = (Servismtr) object;
        return id.equals(tmp.getId());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }


}