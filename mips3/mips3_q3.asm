main:
    li $v0, 5
    syscall
    move $a0, $v0

    jal factorial
    li $v0, 1
    
    move $a0, $t0
    syscall

    li $v0, 10
    syscall

    factorial:
    addi $sp, $sp, -8 
    sw $ra, 4($sp) 
    sw $a0,0($sp) 

    li $t0, 1
    beq $a0, $zero, factorial_unstack

    addi $a0, $a0, -1
    jal factorial
    lw $a0, 0($sp)
    mul $t0, $t0, $a0
    

    factorial_unstack:
    lw $ra, 4($sp) 
    addi $sp,$sp, 8 
    jr $ra 


