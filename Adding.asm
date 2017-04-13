.orig x3000
;Clearing Registries
;*********************
and r0,r0,#0
and r1,r1,#0
and r2,r2,#0
and r3,r3,#0
and r4,r4,#0
and r5,r5,#0
and r6,r6,#0
and r7,r7,#0
;*********************
ld r1,num1
ld r2,num2
ld r5,ascii
add r1,r1,r2
add r1,r1,r5
lea r0,msg
puts
add r0,r1,x0
out
halt
ascii	.fill x0030
num1	.fill x5
num2	.fill x4
msg	.stringz "The Sum is "
.end
