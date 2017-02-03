


public class Manager extends NewWorker {
    NewWorker[] peoplesupervising = new NewWorker[10];
    private int numWorkersSupervised = 0;

    public Manager(String name, String date, double salary) {
        super(name, date, salary);
    }

    public Manager(String name, String date) {
        super(name, date);
    }

    public double getSalary(double salary) {
        return this.getSalary() + (100 * numWorkersSupervised);
    }

    public void addWorker(NewWorker w) {
    	peoplesupervising[numWorkersSupervised++] = w;
    }

    public void deleteWorker(NewWorker w) {
        for(int a = 0; a < numWorkersSupervised; ++a) {
            if(peoplesupervising[a].equals(w)) {
                   int numElements = peoplesupervising.length - ( a + 1 );
                   System.arraycopy( peoplesupervising, a + 1, peoplesupervising, a, numElements);
            }
        }
    }

    public int equals(NewWorker w) {
        if (this == w) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public void heyyou(){
    	System.out.println(this.getName());
    }

    
    public String toString() {
        if(Supervisor != null) {
            return "Employee Number = " + permworkernum + " Name is " + this.getName() + " Date joined company = "
                + dateJoiningCompany.toString() + " Supervisor is " + this.getSupervisorName() + " Salary = " + getSalary((double)getSalary())
                +  " Workers supervised: ";
        }
        else {
            return "Employee Number = " + permworkernum + " Name is " + this.getName() + " Date joined company = "
                    + dateJoiningCompany.toString() + " Salary = " + getSalary((double)getSalary());
        }
    }
    
}