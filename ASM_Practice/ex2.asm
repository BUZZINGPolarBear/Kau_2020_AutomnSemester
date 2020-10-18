    .data
msg: .asciiz "Hello world!"
count: .word 0
newline: .asciiz "\n"
    .text

main:
    lw $s0, count
    j loop

loop:
    la $a0, msg
    li $v0, 4
    syscall

    la $a0, newline
    syscall

    addi $s0, $s0, 1
    bne $s0, 3, loop

    li $v0, 10
    syscall