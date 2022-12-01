import java.util.Arrays;

class Main {
  private static int getStamina(int[] stair, int curStair) {
    if (curStair >= stair.length) {
      return 0;
    }
    int s1 = 0 + stair[curStair] + getStamina(stair, curStair + 1);
    int s2 = 1 + stair[curStair] + getStamina(stair, curStair + 2);
    int s3 = 2 + stair[curStair] + getStamina(stair, curStair + 3);
    return Math.min(s1, Math.min(s2, s3));
  }

  public static int maxStamina(int[] stair, int stamina) throws InsufficientStaminaException {
    int s1 = 0 + getStamina(stair, 0);
    int s2 = 1 + getStamina(stair, 1);
    int s3 = 2 + getStamina(stair, 2);
    int s4 = Math.min(s1, Math.min(s2, s3));
    return stamina - s4;
  }

  public static void main(String[] args) throws InsufficientStaminaException {
    System.out.println(maxStamina(new int[] {0, 1, 2, 3, 0, 1, 2, 3, 0, 1}, 12));
    System.out.println(maxStamina(new int[] {1, 1}, 2));
    System.out.println(maxStamina(new int[] {0, 2, 0, 2, 0, 3, 1, 4}, 10));
    System.out.println(maxStamina(new int[] {1, 1, 1}, 4));
    System.out.println(maxStamina(new int[] {0, 100, 0, 0, 0, 999, 0, 0, 0, 0, 0, 999, 0, 0, 5, 5, 7, 7, 7}, 21));
  }
}