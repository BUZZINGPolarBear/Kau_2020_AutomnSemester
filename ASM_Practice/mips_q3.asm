    .data
promptA: .asciiz "Enter a number: "
promptOdd: .asciiz "ODD"
promptEven: .asciiz "EVEN"
two: .word 2
    .text

main:
    lw $t2, two

    li $v0, 4
    la $a0, promptA
    syscall

    li $v0, 5
    syscall

    move $t1, $v0

    div $t1, $t2
    mfhi $s0

    beq $s0, 1, ODD
    beq $s0, 0, EVEN

    ODD:
        la $a0, promptOdd
        li $v0, 4
        syscall
        li $v0, 10
        syscall

    EVEN:
        la $a0, promptEven
        li $v0, 4
        syscall
        li $v0, 10
        syscall







