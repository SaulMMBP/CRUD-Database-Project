/**
 * 
 */
 
function confirmAlert(event) {
	if(!window.confirm('Are you sure you want to delete this employee?')) {
		event.preventDefault();
	}
}