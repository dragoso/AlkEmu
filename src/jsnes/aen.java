package jsnes;

final class aen extends afc {
   // $FF: synthetic field
   private adv a;

   private aen(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 26;
   }

   public final void a() {
      this.a.e(adv.u(this.a));
      this.a.a.a(this.a.e, this.a.a(adv.u(this.a)).b(this.a.d));
      this.a.b(2);
      this.a.d = this.a.d + 1 & 255;
      this.a.e = this.a.e + 1 & 255;
      if (this.a.c-- != 0) {
         this.a.g(this.a.h - 3 & '\uffff');
      } else {
         this.a.c = 65535;
      }
   }

   // $FF: synthetic method
   aen(adv var1) {
      this(var1, (byte)0);
   }
}
