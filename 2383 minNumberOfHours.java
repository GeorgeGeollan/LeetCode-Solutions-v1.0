class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int energyTotal = 0;
        int ans = 0;

        for(int i: energy) {
            energyTotal += i;
        }

        if(energyTotal >= initialEnergy) {
            ans = energyTotal - initialEnergy + 1;
        }
        

        for(int i: experience) {
            
            if(initialExperience <= i) {
                ans = ans + (i + 1 - initialExperience);
                
                initialExperience = i + 1;
            }

            initialExperience += i;
        }

        return ans;
    }
}
