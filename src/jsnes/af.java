package jsnes;

final class af extends afg {
   // $FF: synthetic field
   private kt a;

   private af(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 9;
   }

   public final void a() {
      int var1 = kt.w(this.a);
      int var2 = kt.g(this.a, var1) + 1 & 255;
      kt.a(this.a, var1, var2);
      kt.c(this.a, var2);
      kt.a(this.a, 5);
   }

   // $FF: synthetic method
   af(kt var1) {
      this(var1, (byte)0);
   }
}