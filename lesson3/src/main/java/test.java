public class test
{
  public static void main(String[] args)
  {
    EmailValidator validator = new EmailValidator();
    System.out.println(validator.isValid("user!name@mail23.com"));
  }
}
