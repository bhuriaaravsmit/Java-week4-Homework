package encapsulation26;

public  class TestEncapsulation {
    public void main(String[] args) {

        Encapsulate obj = new Encapsulate();

        obj.setName("shweta");
        obj.setAge(25);
        obj.srtRollNo(51);

        // Displaying values of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime's rollNo: " + obj.getRollNo());


    }
}