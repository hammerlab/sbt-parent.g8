group("$group$")
name := "$name;format="norm"$"
$if(scala211.truthy && !scala212.truthy)$
`2.11`.only
$elseif(!scala211.truthy && scala212.truthy)$
`2.12`.only
$endif$
