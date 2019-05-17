import java.util.Scanner;

class Staff
{
    String StaffID, Name, Phone, Salary;
    Scanner input = new Scanner(System.in);

    void read()
    {
        System.out.println("Enter StaffID");
        StaffID = input.nextLine();

        System.out.println("Enter Name");
        Name = input.nextLine();

        System.out.println("Enter Phone");
        Phone = input.nextLine();

        System.out.println("Enter Salary");
        Salary = input.nextLine();
    }

    void display()
    {
        System.out.println("STAFFID="+ StaffID);
        System.out.println("NAME= " +Name);
                System.out.println("PHONE =" +Phone);
                        System.out.println("SALARY="+ Salary);
    }
}

class Teaching extends Staff
{
    String Domain, Publication;

    void readTeaching()
    {
        super.read(); // call super class read method
        System.out.println("Enter Domain");
        Domain = input.nextLine();
        System.out.println("Enter Publication");
        Publication = input.nextLine();
    }



    void display()
    {
        super.display(); // call super class display() method
        System.out.println("DOMAIN="+ Domain);
        System.out.println("PUBLICATION="+ Publication);

    }
}

class Technical extends Staff
{
    String Skills;

    void readTechnical()
    {
        super.read(); // call super class read method
        System.out.println("Enter Skills");
        Skills = input.nextLine();
    }

    void display()
    {
        super.display(); // call super class display() method
        System.out.println("SKILLS="+ Skills);

    }
}


class Contract extends Staff
{
    String Period;

    void readContract()
    {
        super.read(); // call super class read method
        System.out.println("Enter Period");
        Period = input.nextLine();
    }

    void display()
    {
        super.display(); // call super class display() method
        System.out.println("PERIOD="+ Period);
    }
}




class Staffdetails
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of staff details to be created");
        int n = input.nextInt();

        Teaching t[] = new Teaching[n];
        Technical tc[] = new Technical[n];
        Contract c[] = new Contract[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter Teaching staff information");
            t[i] = new Teaching();
            t[i].readTeaching();
        }

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter Technical staff information");
            tc[i] = new Technical();
            tc[i].readTechnical();
        }

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter Contract staff information");
            c[i] = new Contract();
            c[i].readContract();
        }

        System.out.println("\n STAFF DETAILS: \n");
        System.out.println("-----TEACHING STAFF DETAILS----- ");

        for (int i = 0; i < n; i++)
        {
            t[i].display();
        }
        System.out.println("-----TECHNICAL STAFF DETAILS-----");
        for (int i = 0; i < n; i++)
        {
            tc[i].display();
        }
        System.out.println("-----CONTRACT STAFF DETAILS-----");
        for (int i = 0; i < n; i++)
        {
            c[i].display();
        }
    }
}

