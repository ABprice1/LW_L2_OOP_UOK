package Q4;

class Owner
{
    private String ownerName;
    private String phoneNo;

    public Owner(String OwnerName, String PhoneNo)
    {
        this.ownerName = OwnerName;
        this.phoneNo = PhoneNo;
    }

    public void setOwnerName(String OwnerName)
    {
        this.ownerName = OwnerName;
    }

    public String getOwnerName()
    {
       return this.ownerName;
    }

    public String getPhoneNo()
    {
        return this.phoneNo;
    }

    public void setPhoneNo(String PhoneNo)
    {
        this.phoneNo = PhoneNo;
    }
}

class Bicycle {
    // Data Member
    private Owner owner;
    //Constructor: Initializes the data member
    public Bicycle() {
        owner.setOwnerName("Unknown");
    }
    public Bicycle(String name,String num) {
        owner.setOwnerName(name);
        owner.setPhoneNo(num);
    }
    //Returns the name of this bicycle's owner
    public String getOwnerName() {
        return owner.getOwnerName();
    }
    //Assigns the name of this bicycle's owner
    public void setOwnerName(String name) {
        owner.setOwnerName(name);
    }
    public String getPhoneNo() {
        return owner.getPhoneNo();
    }
    //Assigns the name of this bicycle's owner
    public void setPhoneNo(String num) {
        owner.setPhoneNo(num);
    }
}

public class Q4_Main {
    public static void main(String[] args) {
    }
}
