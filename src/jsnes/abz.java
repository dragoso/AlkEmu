package jsnes;

final class abz extends afc {
   // $FF: synthetic field
   private adv a;

   private abz(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 14;
   }

   public final void a() {
      int var1 = adv.r(this.a);
      int var2 = adv.f(this.a, adv.d(this.a, var1));
      this.a.g();
      adv.c(this.a, var1, var2);
   }

   // $FF: synthetic method
   abz(adv var1) {
      this(var1, (byte)0);
   }
}
