    .data
array: .space 20
c: .word 0
d: .word 10
    .text
main:
    la $t0, array
    lw $s0, c
    lw $s1, d
   
loop:
    sw $s1, 0($t0)
    addi $t0, $t0, 4
    addi $s1, $s1, -1
    addi $s0, $s0, 1   
    bne $s0,5,loop
    
    
exit:
    li $v0, 10
    syscall
    
   
