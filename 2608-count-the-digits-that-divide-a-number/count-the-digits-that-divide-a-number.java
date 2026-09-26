 class Solution { 
    public int countDigits(int num) { 
        int val = 0; 
        int originalNum = num;  
        
        while (num > 0) {
            int digit = num % 10;  
            
            if (digit != 0 && originalNum % digit == 0) { 
                val++;  
            }
            
            num /= 10;  
        }
        
        return val; 
    } 
}
