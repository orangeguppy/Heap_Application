import React from 'react'
import './Button.css'

const STYLES = [
    'btn--primary',
    'btn--outline',
    'btn--colHero',
    'btn--filter'
]

const SIZES = [
    'btn--medium',
    'btn--large',
    'btn--hero',
    'btn--square'
]

export const Button = ({
    children,
    type,
    onClick,
    buttonStyle,
    buttonSize
}) => {
    const checkButtonStyle = STYLES.includes(buttonStyle) ? buttonStyle : STYLES[0]
    const checkButtonSize = SIZES.includes(buttonSize) ? buttonSize : SIZES[0]

    return(
        <button className={`btn ${checkButtonStyle} ${checkButtonSize}`} onClick={onClick}
        type={type}>
            {children}
        </button>
    )
}