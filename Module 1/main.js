document.addEventListener('DOMContentLoaded', () => {
    console.log("Welcome to the Community Portal!");
  
    const form = document.getElementById('registerForm');
    const output = document.getElementById('confirmation');
  
    if (form) {
      form.addEventListener('submit', function (e) {
        e.preventDefault();
        const name = this.name.value;
        output.textContent = `Thanks for registering, ${name}! We'll contact you soon.`;
      });
    }
  });
  