.data
    a: .word 10, 9, 8, 7, 6
    space: .asciiz " "
.text

main:
    la $t0, a
    li $s0, -1
    li $s1, 0
    li $s2, 4
    j loop_for_i

loop_for_i:
    beq $s0, 3, end
    addi $s0,$s0, 1

    li $t3, 5
    addi $t3, $t3, -1
    sub $t3, $t3, $s0

    mul $t4, $s1,  $s2
    sub $t0, $t0, $t4

    li $s1, 0

    j loop_for_j


loop_for_j:
    beq $s1, $t3, loop_for_i
    addi $s1, $s1, 1

    lw $t1, ($t0)
    addi $t0, $t0, 4
    lw $t2, ($t0)

    ble $t2, $t1, swap


swap:
    move $t4, $t1
    move $t1, $t2
    move $t2, $t4

    addi $t0, $t0, -4
    sw $t1, ($t0)
    addi $t0, $t0, 4 
    sw $t2, ($t0)

    j loop_for_j


end:
    li $v0, 10
    syscall
