package jsnes;

final class aef extends afc {
   // $FF: synthetic field
   private adv a;

   private aef(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 11;
   }

   public final void a() {
      adv.C(this.a, adv.E(this.a));
   }

   // $FF: synthetic method
   aef(adv var1) {
      this(var1, (byte)0);
   }
}