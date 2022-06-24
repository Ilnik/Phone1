public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("89603400799","Iphone 13",123.43 );
        Phone phone2 = new Phone("89371469767","Iphone 10");
        Phone phone3 = new Phone();

        System.out.println(phone1.getNumber());
        System.out.println(phone1.model);
        System.out.println(phone1.weight);
        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.model);
        System.out.println(phone2.weight);

        System.out.println(phone3.getNumber());
        System.out.println(phone3.model);
        System.out.println(phone3.weight);

        phone1.receiveCall("Ilya");
        phone2.receiveCall("Father");
        phone3.receiveCall("Brother");

    }
}
