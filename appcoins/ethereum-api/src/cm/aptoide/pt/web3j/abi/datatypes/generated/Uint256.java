package cm.aptoide.pt.web3j.abi.datatypes.generated;

import cm.aptoide.pt.web3j.abi.datatypes.Uint;
import java.math.BigInteger;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.web3j.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Uint256 extends Uint {
  public static final Uint256 DEFAULT = new Uint256(BigInteger.ZERO);

  public Uint256(BigInteger value) {
    super(256, value);
  }

  public Uint256(long value) {
    this(BigInteger.valueOf(value));
  }
}
