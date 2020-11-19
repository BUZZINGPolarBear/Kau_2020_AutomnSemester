.data
    input_a: .asciiz "input a: "
    input_b: .asciiz "input b: "
.text

main:
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

    sw $t0, ($sp)
    addi $sp, $sp, -4

    sw $t1, ($sp)

    j getGCD

getGCD:  
    lw $t2, ($sp)
    addi $sp, $sp, 4
    lw $t3, ($sp)
    addi $sp, $sp, 4

    sw $t2, 0($sp)
    addi $sp, $sp, -4
    
    div $t3, $t2
    mfhi $t4
    sw $t4, 0($sp)

    beq $t4, 0, show_result
    bne $t4, 0, getGCD

show_result:
    addi $sp, $sp, 4
    lw $a0, ($sp)
    li $v0, 1
    syscall
    li $v0, 10
    syscall


