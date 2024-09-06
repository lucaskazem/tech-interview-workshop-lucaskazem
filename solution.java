class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n > flowerbed.length) {
            return false;
        }

        if (n == 0) {
            return true;
        }

        if (flowerbed.length == 1) {
            if (flowerbed[0] == 0) {
                return true;
            }
            return false;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
        }

        if (flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length -2] == 0) {
            flowerbed[flowerbed.length-1] = 1;
            n--;
        }
        
        int i = 0;
            for (int j = i + 2; j < flowerbed.length; j++) {
                if (n == 0) {
                    return true;
                }
                if (flowerbed[i] == 0 && flowerbed[j] == 0 && flowerbed[i+1] == 0) {
                    n--;
                    flowerbed[i+1] = 1;
                }
                i++;
            }
        

        return false;
    }
}
