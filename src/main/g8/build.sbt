group("$group$")
name := "$name;format="norm"$"
$if(scala211.truthy && !scala212.truthy)$
scala211Only
$elseif(!scala211.truthy && scala212.truthy)$
scala211Only
$endif$
