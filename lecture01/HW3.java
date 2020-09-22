public class HW3 {
    /** to calculate the population number of US in 5 years */
    public static void main (String[] args) {

        // for year in 2019-2024, 0 for 2019, 5 for 2024
        // number of days in each year, 2020 and 2024 have 366 days
        int [] days = new int[] {0, 366, 365, 365, 365, 366};
        // total seconds passed, 2019-2024, from the end of 2019
        int [] seconds = new int[6];
        // total birth number from tne end of 2019 on
        int [] births = new int[6];
        // death number
        int [] deaths = new int[6];
        // immigrants number
        int [] immigrants = new int[6];
        // the population of us, at the end of each year
        int [] pop = new int[6];

        // year, 0 for 2019, 5 for 2024...
        // initialize, at the end of 2019
        pop[0] = 329447467;// the population at the end of 2019
        seconds[0] = 0;
        births[0] = 0;
        deaths[0] = 0;
        immigrants[0] = 0;

        // each year from 2020(1) on
        for(int year = 1;year <= 5; year++) {
            // the total seconds is add by the days of this year
            seconds[year] = seconds[year - 1] + days[year] * 24 * 60 * 60;

            // total population changes, from 2019 on
            births[year] = seconds[year] / 7;
            deaths[year] = seconds[year] / 13;
            immigrants[year] = seconds[year] / 45;

            // population modified from the pop of 2019
            pop[year] = pop[0] + births[year] - deaths[year] + immigrants[year];

            // print the population of this year
            System.out.println(pop[year]);
        }
    }
}
