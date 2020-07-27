
package ammonite
package $file.experiment
import _root_.ammonite.interp.api.InterpBridge.{
  value => interp
}
import _root_.ammonite.interp.api.InterpBridge.value.{
  exit
}
import _root_.ammonite.interp.api.IvyConstructor.{
  ArtifactIdExt,
  GroupIdExt
}
import _root_.ammonite.runtime.tools.{
  browse,
  grep,
  time,
  tail
}
import _root_.ammonite.repl.tools.{
  desugar,
  source
}
import _root_.ammonite.main.Router.{
  doc,
  main
}
import _root_.ammonite.repl.tools.Util.{
  pathScoptRead
}


object chapter5{
/*<script>*/var a = 1;
/*<amm>*/val res_1 = /*</amm>*/const lambda = () => { 
    let a = 2;
    console.log(a);
}
/*<amm>*/val res_2 = /*</amm>*/lambda();
/*<amm>*/val res_3 = /*</amm>*/console.log(a);/*</script>*/ /*<generated>*/
def $main() = { scala.Iterator[String]() }
  override def toString = "chapter5"
  /*</generated>*/
}
