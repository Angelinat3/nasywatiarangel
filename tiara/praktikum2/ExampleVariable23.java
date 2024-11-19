public class ExampleVariable23 {
    public static void main(String[] args) {
        String oneOfMyHobbies = "Read Book";
        boolean isSmart = true;
        char gender = 'F';
        byte _age =18;
        double $gpa = 4.00, height = 1.50;

        System.out.println(oneOfMyHobbies);
        System.out.println("are you smart ? " + isSmart );
        System.out.println("gender : " +gender);
        System.out.println("my current age is "+_age);
        System.out.println(String.format("my GPA is % and my height is %s meters",$gpa,height));
    }
}
