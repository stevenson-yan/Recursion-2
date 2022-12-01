class Main {
    public static int maxStamina(int[] stair, int stamina) throws InsufficientStaminaException {
      if (stair.length()) == 0) {
          return stamina;
      }
      else {
        int nstep = 0;
        int bstep = 0;
        int jump = 0;
      }
  }

  public static void main(String[] args) throws InsufficientStaminaException {
    System.out.println(maxStamina(new int[] {0, 100, 0, 0, 0, 999, 0, 0, 0, 0, 0, 999, 0, 0, 5, 5, 7, 7, 7}, 12));
  }
}