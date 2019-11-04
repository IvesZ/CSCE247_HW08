public abstract class House {

    /**
     * Call all method
     */
    public void buildHouse(){
        prepFoundation();
        createFrame();
        installDrywall();
        addWindows();
        addElectrical();
        addPlumbing();
    }

    /**
     * Print Foundation info
     */
    public void prepFoundation(){
        System.out.println("Foundation: Adding a crawlspace, and a strong backbone.");
    }

    /**
     * Print Drywall info
     */
    public abstract void createFrame();

    public void installDrywall(){
        System.out.println("Drywall: Creating the interior walls.");
    }

    /**
     * Print Windows info
     */
    public void addWindows(){
        System.out.println("Windows: Putting in the glass for the windows.");
    }

    /**
     * Print Electrical info
     */
    public void addElectrical(){
        System.out.println("Electrical: Running all the wires and hooking up the power.");
    }

    /**
     * Print Plumbing info
     */
    public void addPlumbing(){
        System.out.println("Plumbing: Letting water run throug the house.");
    }
}
