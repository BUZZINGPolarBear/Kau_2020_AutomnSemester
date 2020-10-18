.data
    a: .word 3
    c: .word 5
.text

main:
    lw $t1, a
    lw $t2, c
    add $s0, $t1, $t2

    move $a0, $s0
    li $v0, 1
    syscall
    li $v0, 10
    syscall
