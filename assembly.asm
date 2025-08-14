; hello.asm — print a line using Linux syscalls (x86-64)
; Assemble: nasm -felf64 hello.asm && ld -o hello hello.o
; Run: ./hello

global _start

section .data
    msg:    db "Hello from Assembly 🚀", 10
    msglen: equ $ - msg

section .text
_start:
    ; write(1, msg, msglen)
    mov rax, 1          ; sys_write
    mov rdi, 1          ; fd = stdout
    mov rsi, msg        ; buffer
    mov rdx, msglen     ; length
    syscall

    ; exit(0)
    mov rax, 60         ; sys_exit
    xor rdi, rdi        ; status 0
    syscall
