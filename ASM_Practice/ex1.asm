    .data
one: .word 1
two: .word 2
    .text

main:
    lw $t1, one
    lw $t2, two
    add $s1, $t1, $t2

    move $a0, $s1
    li $v0, 1
    syscall
