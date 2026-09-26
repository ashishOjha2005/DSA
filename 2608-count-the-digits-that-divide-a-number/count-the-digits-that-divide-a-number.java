 class Solution { 
    public int countDigits(int num) { 
        int val = 0; 
        
         
        int temp = num;
        while (temp > 0) {
            int d = temp % 10;  
            
             
            if (d == 1 && num % 1 == 0) { val++; }
            else if (d == 2 && num % 2 == 0) { val++; }
            else if (d == 3 && num % 3 == 0) { val++; }
            else if (d == 4 && num % 4 == 0) { val++; }
            else if (d == 5 && num % 5 == 0) { val++; }
            else if (d == 6 && num % 6 == 0) { val++; }
            else if (d == 7 && num % 7 == 0) { val++; }
            else if (d == 8 && num % 8 == 0) { val++; }
            else if (d == 9 && num % 9 == 0) { val++; }
            
            temp = temp / 10;  
        }
        
        return val; 
    } 
}
