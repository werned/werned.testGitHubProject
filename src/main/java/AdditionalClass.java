public class AdditionalClass {
    private String petName;
    private int petAge;

    public AdditionalClass() {
    }

    public AdditionalClass(String petName, int petAge) {
        this.petName = petName;
        this.petAge = petAge;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    @Override
    public String toString() {

        return "AdditionalClass{" +
                "petName='" + petName + '\'' +
                ", petAge=" + petAge +
                '}';
    }
}
