package jsnes;

final class qz extends afc {
   // $FF: synthetic field
   private adv a;

   private qz(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      int var1 = adv.s(this.a);
      int var2 = adv.e(this.a, var1);
      this.a.b((var2 & this.a.c) == 0);
      var2 = (var2 | this.a.c) & '\uffff';
      this.a.g();
      adv.d(this.a, var1, var2);
   }

   // $FF: synthetic method
   qz(adv var1) {
      this(var1, (byte)0);
   }
}
