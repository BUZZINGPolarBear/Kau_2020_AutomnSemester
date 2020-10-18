    .data  
promptA: .asciiz "Enter A: "
promptE: .asciiz "Enter E: "
promptC: .asciiz "Enter C: "
a: .word 0
e: .word 0
c: .word 0
d: .word 0
    .text

main:
    lw $t1, a
    lw $t2, e
    lw $t3, c

    li $v0, 4
    la $a0, promptA
    syscall

    li $v0, 5
    syscall

    move $t1, $v0

    li $v0, 4
    la $a0, promptE
    syscall

    li $v0, 5
    syscall

    move $t2, $v0

    li $v0, 4
    la $a0, promptC
    syscall

    li $v0, 5
    syscall

    move $t3, $v0

    add $t1, $t1, $t2
    mul $t1, $t1, $t3

    move $a0, $t1
    li $v0, 1
    syscall

    li $v0, 10
    syscall


