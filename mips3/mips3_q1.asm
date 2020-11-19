    .data
input_a: .asciiz "input a: "
input_b: .asciiz "input b: "
end_sys: .asciiz "System Ends"
a: .word 0
c: .word 0
    .text

main:
j loop

loop:
    lw $t0, a
    lw $t1, c

    la $a0, input_a
    li $v0, 4
    syscall
    li $v0, 5
    syscall
    move $t0, $v0

    la $a0, input_b
    li $v0, 4
    syscall
    li $v0, 5
    syscall
    move $t1, $v0

    bne $t0, $t1, loop

la $a0, end_sys
li $v0, 4
syscall
li $v0, 10
syscall