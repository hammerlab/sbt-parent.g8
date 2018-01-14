group("$group$")
name := "$name;format="norm"$"
$if(scala211.truthy && scala212.truthy)$
addScala212
$elseif(scala212.truthy)$
scala212Only
$endif$
