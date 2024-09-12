//Name: Rebecca Pilgrim
//Email: rebecca.pilgrim@und.edu

class main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("First: ");
		String firstName = input.nextLine();

		System.out.println("Last: ");
		String lastName = input.nextLine();

		System.out.println("Address: ");
		String address = input.nextLine();

		System.out.println("City: ");
		String city = input.nextLine();

		System.out.println("State: ");
		String state = input.nextLine();

		System.out.println("Zip: ");
		String zip = input.nextLine();


		System.out.println(firstName + " " + lastName);
		System.out.println(address);
		System.out.println(city + ", " + state + " " + zip);
	}}