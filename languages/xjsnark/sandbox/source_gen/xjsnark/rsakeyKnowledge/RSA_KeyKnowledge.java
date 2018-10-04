package xjsnark.rsakeyKnowledge;

/*Generated by MPS */

import backend.structure.CircuitGenerator;
import backend.eval.SampleRun;
import java.math.BigInteger;
import backend.auxTypes.UnsignedInteger;
import backend.eval.CircuitEvaluator;

public class RSA_KeyKnowledge extends CircuitGenerator {



  public static void main(String[] args) {
    // This is the java main method. Its purpose is to make the Progam runnable in the environment 
    // This method can be left empty, or used to set Configuration params (see examples) 

    new RSA_KeyKnowledge();
  }

  public RSA_KeyKnowledge() {
    super("RSA_KeyKnowledge");
    __generateCircuit();
    this.__evaluateSampleRun(new SampleRun("Sample_Run1", true) {
      public void pre() {
        // USE JAVA BigInteger to set values 
        modulus.mapValue(new BigInteger("cdfde0f7da44ba3f44e1a07cac97c079bc407697caab25089a92cbaf00efc98a081029407b851133febd308a5360b4be8ffaa3e176b586bc224c6f8589148bf12c409cf338bff75b9e760e28868d4084d62bd42b97c4bdd72784ab9fe5be6b16b6ed75ab75c11f685e3f44f985c3d573854985953a752262d26543fd2e39592b76afb62ab05a0fdfcd1e673bb069d1b8c5ef93b319006085f62dab8758d2b314b9ed569285a3753505642e2b687349e42fec9c19f57eb7467549d4746f0c3876ba59b1aeef75869dd6a45252b92259e61b9bead6eeb5e1809e09215ea2970018bb9015d00a49ba7de55e7a230e4b468aba7c0a88eb736705fd6b260a763f2583", 16), CircuitGenerator.__getActiveCircuitGenerator().__getCircuitEvaluator());

        p.mapValue(new BigInteger("f290a3bf144c3155194c0bafd14f7c28e775e960e2d41f7a2089b5315f6027937d0e7e53a2a51e66a6b1c4d08b9015ca89c4a1e2085eea680dca3ec18ff085627fbc20fc56363d40615264772600702be853acbe46d79271ca7d6699c5fab3e11a9cd0c77b2c0bed064143c112f7cd938439b5f5a02e9a7094ee549366dd2e11", 16), CircuitGenerator.__getActiveCircuitGenerator().__getCircuitEvaluator());
        q.mapValue(new BigInteger("d966a96decaad14b86f2372d228c5ac955ebe9410f88dd77c2a26d40549a9ddaf2c03476ed1725d0e5b42cf89d1ee1ca367dcfbd8febb2d7d8431e92c441ae3900394391b1ca9bb02eb3b4e69418d2e8099be805e28e1024965897a181872581dd3e46dfa6069fab969064b885528c1217973f58876bc4823a78ca204c97d653", 16), CircuitGenerator.__getActiveCircuitGenerator().__getCircuitEvaluator());
      }
      public void post() {
        // no output expected. We just want to see that the assertions will go through.  
        // Any changes to the numbers above should result into failed assertions 
        System.out.println("If no failed assertions appear, everything looks to be OK for this circuit.");

      }

    });

  }



  public void __init() {
    p = new UnsignedInteger(1024, new BigInteger("0"));
    q = new UnsignedInteger(1024, new BigInteger("0"));
    modulus = new UnsignedInteger(2048, new BigInteger("0"));
  }

  public UnsignedInteger p;
  public UnsignedInteger q;
  public UnsignedInteger modulus;

  @Override
  public void __defineInputs() {
    super.__defineInputs();
    modulus = UnsignedInteger.createInput(this, 2048);







  }
  @Override
  public void __defineOutputs() {
    super.__defineOutputs();







  }
  @Override
  public void __defineVerifiedWitnesses() {
    super.__defineVerifiedWitnesses();

    p = UnsignedInteger.createVerifiedWitness(this, 1024);
    q = UnsignedInteger.createVerifiedWitness(this, 1024);









  }
  @Override
  public void __defineWitnesses() {
    super.__defineWitnesses();









  }
  public void outsource() {

    // Checking Validity 
    // if we multiply p*q directly, we will get a 1024-bit integer 
    // therefore we just promote one of them to the higher bitwidth type, using uint_2048(p) 
    modulus.forceEqual(UnsignedInteger.instantiateFrom(2048, p).mul(q));
    // casting can be done as well, but its editing is bit tricky in this environment 

    // In the background, xjsnark checks conditions on p and q, and verifies the equality efficiently 
  }

  public void __generateSampleInput(CircuitEvaluator evaluator) {
    __generateRandomInput(evaluator);
  }

}
